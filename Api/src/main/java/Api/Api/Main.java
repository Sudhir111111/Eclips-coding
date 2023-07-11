package Api.Api;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

public class Main {
	public static void main(String[] args) {
		Json js=new Json("sudhir", "computer", "15");
		Json js1=new Json("sudee", "computer", "15");
		List<Json> jt=new ArrayList<Json>();
		jt.add(js);
		jt.add(js1);

		
		Gson gs=new Gson();
		String json = gs.toJson(jt);
		System.out.println(json);
	}

}
