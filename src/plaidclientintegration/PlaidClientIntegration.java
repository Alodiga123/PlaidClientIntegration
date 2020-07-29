/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plaidclientintegration;

import com.alodiga.plaid.response.ExchangeTokenResponse;
import com.alodiga.plaid.response.RetriveAuthResponse;
import com.alodiga.plaid.response.RetriveBalanceResponse;
import com.alodiga.plaid.response.RetriveIdentityResponse;
import com.alodiga.plaid.response.RetriveIncomeResponse;
import com.alodiga.plaid.response.RetriveTransactionResponse;
import com.alodiga.plaid.response.TokenResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import com.google.gson.Gson;

/**
 *
 * @author ltoro
 */
public class PlaidClientIntegration {

    private static final int CONNECTION_TIMEOUT = 10000;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws MalformedURLException, ProtocolException, IOException, Exception {
        // TODO code application logic here
        PlaidClientIntegration clientIntegration = new PlaidClientIntegration();
        clientIntegration.plaidRetrieveTransaction("5eea3c83ca4e880014b64ce2", "77ce7afbc3853883de5fc4ec90bd30");
    }

    public TokenResponse plaidCreateItem(String products) throws MalformedURLException, ProtocolException, IOException, Exception {

        HttpURLConnection connection = null;
        InputStream is = null;
        String response = null;

        try {
            // set up URL connection
            java.net.URL url = new java.net.URL("https://sandbox.plaid.com/sandbox/public_token/create");
            connection = (HttpURLConnection) url.openConnection();
            connection.setConnectTimeout(CONNECTION_TIMEOUT);
            connection.setDoOutput(true);
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setRequestProperty("User-Agent", "Plaid Postman");
            // write out form parameters
            String postParamaters = "{\n"
                    + "  \"public_key\": \"bd84c80b44b5e21a5169d88292acf3\",\n"
                    + "  \"institution_id\": \"ins_3\",\n"
                    + "  \"initial_products\": [\"" + products + "\"],\n"
                    + "  \"options\": {\n"
                    + "    \"webhook\": \"https://www.genericwebhookurl.com/webhook\"\n"
                    + "  }\n"
                    + "}";
            //System.out.println(postParamaters);
            connection.setFixedLengthStreamingMode(postParamaters.getBytes().length);
            PrintWriter out = new PrintWriter(connection.getOutputStream());
            out.print(postParamaters);
            out.close();
            //Get Response  
            try {
                is = connection.getInputStream();
            } catch (IOException ioe) {
                if (connection instanceof HttpURLConnection) {
                    HttpURLConnection httpConn = (HttpURLConnection) connection;
                    int statusCode = httpConn.getResponseCode();
                    System.out.println(httpConn.getResponseCode());
                    System.out.println(statusCode);
                    if (statusCode != 200) {
                        is = httpConn.getErrorStream();
                    }
                }
            }
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream(), "UTF-8"));
            String inputLine = "";
            String outputString = "";
            while ((inputLine = in.readLine()) != null) {
                outputString = outputString + inputLine;
            }
            TokenResponse tokenResponse = new Gson().fromJson(outputString, TokenResponse.class);
            // System.out.println("tokenResponse   " + tokenResponse.getPublic_token());
            in.close();
            return tokenResponse;
        } catch (SocketTimeoutException e) {
            e.printStackTrace();
            throw new SocketTimeoutException();
        } catch (ConnectException ex) {
            ex.printStackTrace();
            throw new ConnectException();
        } catch (IOException ex) {
            ex.printStackTrace();
            throw new IOException();
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new Exception();
        } finally {
            if (connection != null) {
                connection.disconnect();
            }
        }
    }

    public ExchangeTokenResponse plaidExchangeToken(String token) throws MalformedURLException, ProtocolException, IOException, Exception {

        HttpURLConnection connection = null;
        InputStream is = null;
        String response = null;
        PlaidClientIntegration clientIntegration = new PlaidClientIntegration();

        try {
            // set up URL connection
            java.net.URL url = new java.net.URL("https://sandbox.plaid.com/item/public_token/exchange");
            connection = (HttpURLConnection) url.openConnection();
            connection.setConnectTimeout(CONNECTION_TIMEOUT);
            connection.setDoOutput(true);
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setRequestProperty("User-Agent", "Plaid Postman");
            // write out form parameters            
            String postParamaters = "{\n"
                    + "	\"client_id\": \"5eea3c83ca4e880014b64ce2\",\n"
                    + "	\"secret\": \"77ce7afbc3853883de5fc4ec90bd30\",\n"
                    + "	\"public_token\": \"" + token + "\"\n"
                    + "}";
            //System.out.println(postParamaters);
            connection.setFixedLengthStreamingMode(postParamaters.getBytes().length);
            PrintWriter out = new PrintWriter(connection.getOutputStream());
            out.print(postParamaters);
            out.close();
            //Get Response  
            try {
                is = connection.getInputStream();
            } catch (IOException ioe) {
                if (connection instanceof HttpURLConnection) {
                    HttpURLConnection httpConn = (HttpURLConnection) connection;
                    int statusCode = httpConn.getResponseCode();
                    System.out.println(httpConn.getResponseCode());
                    System.out.println(statusCode);
                    if (statusCode != 200) {
                        is = httpConn.getErrorStream();
                    }
                }
            }
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream(), "UTF-8"));
            String inputLine = "";
            String outputString = "";
            while ((inputLine = in.readLine()) != null) {
                outputString = outputString + inputLine;

            }
            ExchangeTokenResponse exchangeToken = new Gson().fromJson(outputString, ExchangeTokenResponse.class);
            // System.out.println("accesToken   " + exchangeToken.getAccess_token());
            in.close();
            return exchangeToken;
        } catch (SocketTimeoutException e) {
            e.printStackTrace();
            throw new SocketTimeoutException();
        } catch (ConnectException ex) {
            ex.printStackTrace();
            throw new ConnectException();
        } catch (IOException ex) {
            ex.printStackTrace();
            throw new IOException();
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new Exception();
        } finally {
            if (connection != null) {
                connection.disconnect();
            }
        }
    }

    public RetriveAuthResponse plaidRetrieveAuth(String clientId, String secret) throws MalformedURLException, ProtocolException, IOException, Exception {

        HttpURLConnection connection = null;
        InputStream is = null;
        String response = null;
        PlaidClientIntegration clientIntegration = new PlaidClientIntegration();

        try {
            // set up URL connection
            java.net.URL url = new java.net.URL("https://sandbox.plaid.com/auth/get");
            connection = (HttpURLConnection) url.openConnection();
            connection.setConnectTimeout(CONNECTION_TIMEOUT);
            connection.setDoOutput(true);
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setRequestProperty("User-Agent", "Plaid Postman");
            // write out form parameters
            String publicToken = clientIntegration.plaidCreateItem("auth").getPublic_token();
            String token = clientIntegration.plaidExchangeToken(publicToken).getAccess_token();
            String postParamaters = "{\n"
                    + "	\"client_id\": \""+clientId+"\",\n"
                    + "	\"secret\": \""+secret+"\",\n"
                    + "	\"access_token\": \"" + token + "\"\n"
                    + "}";
            //System.out.println(postParamaters);
            connection.setFixedLengthStreamingMode(postParamaters.getBytes().length);
            PrintWriter out = new PrintWriter(connection.getOutputStream());
            out.print(postParamaters);
            out.close();
            //Get Response  
            try {
                is = connection.getInputStream();
            } catch (IOException ioe) {
                if (connection instanceof HttpURLConnection) {
                    HttpURLConnection httpConn = (HttpURLConnection) connection;
                    int statusCode = httpConn.getResponseCode();
                    System.out.println(httpConn.getResponseCode());
                    System.out.println(statusCode);
                    if (statusCode != 200) {
                        is = httpConn.getErrorStream();
                    }
                }
            }
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream(), "UTF-8"));
            String inputLine = "";
            String outputString = "";
            while ((inputLine = in.readLine()) != null) {
                outputString = outputString + inputLine;

            }
            System.out.println("REsponde" + outputString);
            RetriveAuthResponse retriveAuthResponse = new Gson().fromJson(outputString, RetriveAuthResponse.class);
            System.out.println("Avalible : " + retriveAuthResponse.getAccounts().get(1).getBalances().getAvailable());
            System.out.println("Numbers : " + retriveAuthResponse.getNumbers().getAch().get(1).getAccount());
            in.close();
            return retriveAuthResponse;
        } catch (SocketTimeoutException e) {
            e.printStackTrace();
            throw new SocketTimeoutException();
        } catch (ConnectException ex) {
            ex.printStackTrace();
            throw new ConnectException();
        } catch (IOException ex) {
            ex.printStackTrace();
            throw new IOException();
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new Exception();
        } finally {
            if (connection != null) {
                connection.disconnect();
            }
        }
    }

    public RetriveTransactionResponse plaidRetrieveTransaction(String clientId, String secret) throws MalformedURLException, ProtocolException, IOException, Exception {

        HttpURLConnection connection = null;
        InputStream is = null;
        String response = null;
        PlaidClientIntegration clientIntegration = new PlaidClientIntegration();

        try {
            // set up URL connection
            java.net.URL url = new java.net.URL("https://sandbox.plaid.com/transactions/get");
            connection = (HttpURLConnection) url.openConnection();
            connection.setConnectTimeout(CONNECTION_TIMEOUT);
            connection.setDoOutput(true);
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setRequestProperty("User-Agent", "Plaid Postman");
            // write out form parameters
            String publictoken = clientIntegration.plaidCreateItem("transactions").getPublic_token();
            String token = clientIntegration.plaidExchangeToken(publictoken).getAccess_token();
            //System.out.println("exchangetoken123   " + token);
            String postParamaters = "{\n"
                    + "	\"client_id\": \""+clientId+"\",\n"
                    + "	\"secret\": \""+secret+"\",\n"
                    + "	\"access_token\": \"access-sandbox-f68df4b5-94a4-44dc-9445-7ac10c6cabe5\",\n"
                    + "	\"start_date\": \"2018-01-01\",\n"
                    + "	\"end_date\": \"2019-01-01\"\n"
                    + "}";
            //System.out.println(postParamaters);
            connection.setFixedLengthStreamingMode(postParamaters.getBytes().length);
            PrintWriter out = new PrintWriter(connection.getOutputStream());
            out.print(postParamaters);
            out.close();
            //Get Response  
            try {
                is = connection.getInputStream();
            } catch (IOException ioe) {
                if (connection instanceof HttpURLConnection) {
                    HttpURLConnection httpConn = (HttpURLConnection) connection;
                    int statusCode = httpConn.getResponseCode();
                    System.out.println(httpConn.getResponseCode());
                    System.out.println(statusCode);
                    if (statusCode != 200) {
                        is = httpConn.getErrorStream();
                    }
                }
            }
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream(), "UTF-8"));
            String inputLine = "";
            String outputString = "";
            while ((inputLine = in.readLine()) != null) {
                outputString = outputString + inputLine;

            }
            System.out.println("response" + outputString);
            RetriveTransactionResponse retriveTransactionResponse = new Gson().fromJson(outputString, RetriveTransactionResponse.class);
            System.out.println("retrive" + retriveTransactionResponse.getTransactions().get(0).getAccount_id());
            in.close();
            return retriveTransactionResponse;
        } catch (SocketTimeoutException e) {
            e.printStackTrace();
            throw new SocketTimeoutException();
        } catch (ConnectException ex) {
            ex.printStackTrace();
            throw new ConnectException();
        } catch (IOException ex) {
            ex.printStackTrace();
            throw new IOException();
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new Exception();
        } finally {
            if (connection != null) {
                connection.disconnect();
            }
        }
    }

    public RetriveBalanceResponse plaidRetrieveBalance(String clientId, String secret) throws MalformedURLException, ProtocolException, IOException, Exception {

        HttpURLConnection connection = null;
        InputStream is = null;

        PlaidClientIntegration clientIntegration = new PlaidClientIntegration();

        try {
            // set up URL connection
            java.net.URL url = new java.net.URL("https://sandbox.plaid.com/accounts/balance/get");
            connection = (HttpURLConnection) url.openConnection();
            connection.setConnectTimeout(CONNECTION_TIMEOUT);
            connection.setDoOutput(true);
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setRequestProperty("User-Agent", "Plaid Postman");
            // write out form parameters
            String publicToken = clientIntegration.plaidCreateItem("auth").getPublic_token();
            String token = clientIntegration.plaidExchangeToken(publicToken).getAccess_token();
            String postParamaters = "{\n"
                    + "  \"client_id\": \""+clientId+"\",\n"
                    + "	\"secret\": \""+secret+"\",\n"
                    + "	\"access_token\": \"" + token + "\"\n"
                    + "}";
            //System.out.println(postParamaters);
            connection.setFixedLengthStreamingMode(postParamaters.getBytes().length);
            PrintWriter out = new PrintWriter(connection.getOutputStream());
            out.print(postParamaters);
            out.close();
            //Get Response  
            try {
                is = connection.getInputStream();
            } catch (IOException ioe) {
                if (connection instanceof HttpURLConnection) {
                    HttpURLConnection httpConn = (HttpURLConnection) connection;
                    int statusCode = httpConn.getResponseCode();
                    System.out.println(httpConn.getResponseCode());
                    System.out.println(statusCode);
                    if (statusCode != 200) {
                        is = httpConn.getErrorStream();
                    }
                }
            }
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream(), "UTF-8"));
            String inputLine = "";
            String outputString = "";
            while ((inputLine = in.readLine()) != null) {
                outputString = outputString + inputLine;

            }

            RetriveBalanceResponse retriveBalanceResponse = new Gson().fromJson(outputString, RetriveBalanceResponse.class);
            System.out.println("Account" + retriveBalanceResponse.getAccounts().get(0).getAccount_id());
            in.close();
            return retriveBalanceResponse;
        } catch (SocketTimeoutException e) {
            e.printStackTrace();
            throw new SocketTimeoutException();
        } catch (ConnectException ex) {
            ex.printStackTrace();
            throw new ConnectException();
        } catch (IOException ex) {
            ex.printStackTrace();
            throw new IOException();
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new Exception();
        } finally {
            if (connection != null) {
                connection.disconnect();
            }
        }
    }

    public RetriveIdentityResponse plaidRetrieveIdentity(String clientId, String secret) throws MalformedURLException, ProtocolException, IOException, Exception {

        HttpURLConnection connection = null;
        InputStream is = null;

        PlaidClientIntegration clientIntegration = new PlaidClientIntegration();

        try {
            // set up URL connection
            java.net.URL url = new java.net.URL("https://sandbox.plaid.com/identity/get");
            connection = (HttpURLConnection) url.openConnection();
            connection.setConnectTimeout(CONNECTION_TIMEOUT);
            connection.setDoOutput(true);
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setRequestProperty("User-Agent", "Plaid Postman");
            // write out form parameters
            String publicToken = clientIntegration.plaidCreateItem("identity").getPublic_token();
            String token = clientIntegration.plaidExchangeToken(publicToken).getAccess_token();
            System.out.println("exchangetoken123   " + token);
            String postParamaters = "{\n"
                    + "  \"client_id\": \""+clientId+"\",\n"
                    + "	\"secret\": \""+secret+"\",\n"
                    + "	\"access_token\": \"" + token + "\"\n"
                    + "}";
            //System.out.println(postParamaters);
            connection.setFixedLengthStreamingMode(postParamaters.getBytes().length);
            PrintWriter out = new PrintWriter(connection.getOutputStream());
            out.print(postParamaters);
            out.close();
            //Get Response  
            try {
                is = connection.getInputStream();
            } catch (IOException ioe) {
                if (connection instanceof HttpURLConnection) {
                    HttpURLConnection httpConn = (HttpURLConnection) connection;
                    int statusCode = httpConn.getResponseCode();
                    System.out.println(httpConn.getResponseCode());
                    System.out.println(statusCode);
                    if (statusCode != 200) {
                        is = httpConn.getErrorStream();
                    }
                }
            }
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream(), "UTF-8"));
            String inputLine = "";
            String outputString = "";
            while ((inputLine = in.readLine()) != null) {
                outputString = outputString + inputLine;
            }
            System.out.println("responde" + outputString);
            RetriveIdentityResponse retriveIdentityResponse = new Gson().fromJson(outputString, RetriveIdentityResponse.class);
            System.out.println("retrive" + retriveIdentityResponse.getAccounts().get(0).getOwners().get(0).getAddresses().get(0).getData().getCity());
            in.close();
            return retriveIdentityResponse;
        } catch (SocketTimeoutException e) {
            e.printStackTrace();
            throw new SocketTimeoutException();
        } catch (ConnectException ex) {
            ex.printStackTrace();
            throw new ConnectException();
        } catch (IOException ex) {
            ex.printStackTrace();
            throw new IOException();
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new Exception();
        } finally {
            if (connection != null) {
                connection.disconnect();
            }
        }
    }

    public RetriveIncomeResponse plaidRetrieveIncome(String clientId, String secret) throws MalformedURLException, ProtocolException, IOException, Exception {

        HttpURLConnection connection = null;
        InputStream is = null;

        PlaidClientIntegration clientIntegration = new PlaidClientIntegration();

        try {
            // set up URL connection
            java.net.URL url = new java.net.URL("https://sandbox.plaid.com/income/get");
            connection = (HttpURLConnection) url.openConnection();
            connection.setConnectTimeout(CONNECTION_TIMEOUT);
            connection.setDoOutput(true);
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setRequestProperty("User-Agent", "Plaid Postman");
            // write out form parameters
            String publicToken = clientIntegration.plaidCreateItem("income").getPublic_token();
            String token = clientIntegration.plaidExchangeToken(publicToken).getAccess_token();
            System.out.println("exchangetoken123   " + token);
            String postParamaters = "{\n"
                    + "  \"client_id\": \""+clientId+"\",\n"
                    + "	\"secret\": \""+secret+"\",\n"
                    + "	\"access_token\": \"access-sandbox-57774be1-bfba-4253-a4da-7db76b304029\"\n"
                    + "}";
            //System.out.println(postParamaters);
            connection.setFixedLengthStreamingMode(postParamaters.getBytes().length);
            PrintWriter out = new PrintWriter(connection.getOutputStream());
            out.print(postParamaters);
            out.close();
            //Get Response  
            try {
                is = connection.getInputStream();
            } catch (IOException ioe) {
                if (connection instanceof HttpURLConnection) {
                    HttpURLConnection httpConn = (HttpURLConnection) connection;
                    int statusCode = httpConn.getResponseCode();
                    System.out.println(httpConn.getResponseCode());
                    System.out.println(statusCode);
                    if (statusCode != 200) {
                        is = httpConn.getErrorStream();
                    }
                }
            }
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream(), "UTF-8"));
            String inputLine = "";
            String outputString = "";
            while ((inputLine = in.readLine()) != null) {
                outputString = outputString + inputLine;

            }
            System.out.println("response" + outputString);
            RetriveIncomeResponse retriveIncomeResponse = new Gson().fromJson(outputString, RetriveIncomeResponse.class);
            System.out.println("retrive" + retriveIncomeResponse.getIncome().getIncomeStreams().get(0).getConfidence());
            in.close();
            return retriveIncomeResponse;
        } catch (SocketTimeoutException e) {
            e.printStackTrace();
            throw new SocketTimeoutException();
        } catch (ConnectException ex) {
            ex.printStackTrace();
            throw new ConnectException();
        } catch (IOException ex) {
            ex.printStackTrace();
            throw new IOException();
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new Exception();
        } finally {
            if (connection != null) {
                connection.disconnect();
            }
        }
    }
}
