package utility;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.codec.binary.Base64;

//import testlinkAPIClient.TestLinkAPIClient;

public class TLHelper {
	public static void getTestCaseAttachments(int tcId, String datFile) {
		TestLinkAPIClient tlClient = new TestLinkAPIClient();
		Map map = tlClient.getTestCaseAttachments(tcId);
		try {
			Set keys = map.keySet();
			Iterator itr = keys.iterator();
			String key;
			String value;
			while (itr.hasNext()) {
				key = (String) itr.next();
				Map mp1 = (Map) map.get(key);
				Set keys1 = mp1.keySet();
				Iterator itr1 = keys1.iterator();
				String key1;
				String value1;
				while (itr1.hasNext()) {
					key1 = (String) itr1.next();
					if (key1.equals("content")) {
						value1 = (String) mp1.get(key1);
						byte[] decodedBytes = Base64.decodeBase64(value1);
						File file = new File(datFile);
						BufferedOutputStream writer = new BufferedOutputStream(new FileOutputStream(file));
						writer.write(decodedBytes);
						writer.flush();
						writer.close();
						break;
					}
				}
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	public static int getTestCaseIDByName(String tcName) {
		TestLinkAPIClient tlClient = new TestLinkAPIClient();
		Object[] result = tlClient.getTestCaseIDByName(tcName);
		Map map = (Map) result[0];
		int tcId = Integer.parseInt((String) map.get("id"));
		// Typically you'd want to validate the result here and probably do something more useful with it
		System.out.println("Result was:\n");				
		for (int i=0; i< result.length; i++)
		{
			Map item = (Map)result[i];
			System.out.println("Keys: " + item.keySet().toString() + " values: " + item.values().toString());
		}

		//result = (int[]) rpcClient.execute("tl.getTestCaseIDByName", params);

		return tcId;
	}

	public static void reportTCResult(int tcid, int planId, String status, String build, String execDuration) {
		List<Map> steps = new ArrayList<Map>();
		if (status == "p") {
			for (int i = 0;i < 50;i++) {
				Map step = new HashMap();
				step.put("step_number", Integer.toString(i + 1));
				step.put("result", "p");
				step.put("notes", "step passed");
				steps.add(step);
			}
		}
		TestLinkAPIClient tlClient = new TestLinkAPIClient();
		tlClient.reportTCResult(tcid, planId, status, build, steps, execDuration);
	}

}
