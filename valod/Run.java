


import org.junit.runner.JUnitCore;
import org.junit.runner.Result;




//true false
import org.junit.runner.notification.Failure;
import junit.runner.Version;

public class Run {
	
	public static void main(String[] args)  {
	
	Result result = JUnitCore.runClasses(helloworld.class);		
	//Result result = JUnitCore.runClasses(KadrTourDilijan.class);
	//Result result1 = JUnitCore.runClasses(Benjerryf.class);
		
		/*APIClient client = new APIClient("https://testarmenia2018.testrail.io/");
		client.setUser("berberyan-ani@mail.ru");
		client.setPassword("keffLulYGspoyS0o0f88");
		Map <String, Integer> data = new HashMap <String, Integer> ();	
		data.put("status_id", new Integer(1));
		JSONObject r = (JSONObject) client.sendPost("add_result_for_case/2/6", data);*/
		//ConnectTestRail();
		//Case();
		

		/*APIClient client = new APIClient("https://testarmenia2018.testrail.io/");
		client.setUser("berberyan-ani@mail.ru");
		client.setPassword("keffLulYGspoyS0o0f88");
		Map <String, Integer> data = new HashMap <String, Integer> ();	
		data.put("status_id", new Integer(1));

		JSONObject r = (JSONObject) client.sendPost("add_result_for_case/2/6", data);*/
	
	



		
		
		for (Failure failure : result.getFailures()) {
		System.out.println(failure.toString());
		}
		System.out.println (result.wasSuccessful());



}
}
