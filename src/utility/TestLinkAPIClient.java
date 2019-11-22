package utility;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

public class TestLinkAPIClient {

	//public static final String DEV_KEY =  "7fecf573ec294df74df55f2d6dd2b9bd"; // sbilife
	//public static final String SERVER_URL = "http://quality.sbilife.co.in/lib/api/xmlrpc/v1/xmlrpc.php"; // sbilife
	public static final String DEV_KEY =  "cf1470aab9209f807f6334b9e1a99335";
	public static final String SERVER_URL = "http://localhost/testlink/lib/api/xmlrpc/v1/xmlrpc.php";
	//public static final String DEV_KEY =  "e2baf00bb33e4149c197f5c70a396b4d";
	//public static final String SERVER_URL = "http://localhost/testlink/lib/api/xmlrpc/v1/xmlrpc.php";

	public static Object[] getTestCaseIDByName(String tcName) {
		//int[] result = null;
		Object[] result = null;
		try {
			XmlRpcClient rpcClient;
			XmlRpcClientConfigImpl config;
			
			config = new XmlRpcClientConfigImpl();
			config.setServerURL(new URL(SERVER_URL));
			rpcClient = new XmlRpcClient();
			rpcClient.setConfig(config);		
			
			ArrayList<Object> params = new ArrayList<Object>();
			Hashtable<String, Object> executionData = new Hashtable<String, Object>();				
			executionData.put("devKey", DEV_KEY);
			executionData.put("testcasename", tcName);
			//executionData.put("testsuitename", "Get Quote");
			params.add(executionData);
			result = (Object[]) rpcClient.execute("tl.getTestCaseIDByName", params);

		}
		catch (MalformedURLException e)
		{
			e.printStackTrace();
		}
		catch (XmlRpcException e)
		{
			e.printStackTrace();
		}
		
		return result;
	}
	
	public static Map getTestCaseAttachments(int tcId) {
		Map result = new HashMap();
		try {
			XmlRpcClient rpcClient;
			XmlRpcClientConfigImpl config;
			
			config = new XmlRpcClientConfigImpl();
			config.setServerURL(new URL(SERVER_URL));
			rpcClient = new XmlRpcClient();
			rpcClient.setConfig(config);		
			
			ArrayList<Object> params = new ArrayList<Object>();
			Hashtable<String, Object> executionData = new Hashtable<String, Object>();				
			executionData.put("devKey", DEV_KEY);
			executionData.put("testcaseid", tcId);
			params.add(executionData);
			
			result = (Map) rpcClient.execute("tl.getTestCaseAttachments", params);
		}
		catch (MalformedURLException e)
		{
			e.printStackTrace();
		}
		catch (XmlRpcException e)
		{
			e.printStackTrace();
		}
		return result;

	}
	
	/**
	 * report test execution to TestLink API
	 * 
	 * @param int tcid
	 * @param int tpid
	 * @param String status
	 */
	public static void reportTCResult(int tcid, int tpid, String status, String buildName, List<Map> steps, String execDuration)
	{
		try 
		{
			XmlRpcClient rpcClient;
			XmlRpcClientConfigImpl config;
			
			config = new XmlRpcClientConfigImpl();
			config.setServerURL(new URL(SERVER_URL));
			rpcClient = new XmlRpcClient();
			rpcClient.setConfig(config);		
			
			ArrayList<Object> params = new ArrayList<Object>();
			Hashtable<String, Object> executionData = new Hashtable<String, Object>();				
			executionData.put("devKey", DEV_KEY);
			executionData.put("testcaseid", tcid);
			executionData.put("testplanid", tpid);
			executionData.put("status", status);
			executionData.put("buildname", buildName);
			executionData.put("steps", steps);
			executionData.put("execduration", execDuration);
			
			params.add(executionData);
			
			Object[] result = (Object[]) rpcClient.execute("tl.reportTCResult", params);

			// Typically you'd want to validate the result here and probably do something more useful with it
			System.out.println("Result was:\n");				
			for (int i=0; i< result.length; i++)
			{
				Map item = (Map)result[i];
				System.out.println("Keys: " + item.keySet().toString() + " values: " + item.values().toString());
			}
		}
		catch (MalformedURLException e)
		{
			e.printStackTrace();
		}
		catch (XmlRpcException e)
		{
			e.printStackTrace();
		}
	}

}
