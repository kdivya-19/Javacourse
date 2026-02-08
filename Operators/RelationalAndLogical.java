package Operators;

public class RelationalAndLogical {
	int age;
	boolean hasId;
	
	public void checkLogin(int age,boolean hasId){
		if(age>=18 && hasId) {
			System.out.println("Login ");
		}else {
			System.out.println("Cannot login ");
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RelationalAndLogical obj=new RelationalAndLogical();
		obj.age=18;
		obj.hasId=false;
		obj.checkLogin(obj.age,obj.hasId);
		
		RelationalAndLogical ob=new RelationalAndLogical();
		ob.age=16;
		ob.hasId=true;
		ob.checkLogin(ob.age,ob.hasId);
		
		RelationalAndLogical ob2=new RelationalAndLogical();
		ob2.age=13;
		ob2.hasId=false;
		ob2.checkLogin(ob2.age,ob2.hasId);
		
		RelationalAndLogical ob3=new RelationalAndLogical();
		ob3.age=31;
		ob3.hasId=true;
		ob3.checkLogin(ob3.age,ob3.hasId);
	}

}
