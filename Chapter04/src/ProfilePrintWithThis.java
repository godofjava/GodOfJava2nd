// this 는 194 페이지를 참고하세요.
public class ProfilePrintWithThis {
	byte age;
	String name;
	boolean isMarried;
	
	public static void main(String[] args) {
		ProfilePrintWithThis profile=new ProfilePrintWithThis();
		byte age=20;
		String name="Min";
		boolean isMarried=true;
		
		profile.setAge(age);
		profile.setName(name);
		profile.setMarried(isMarried);
		
		System.out.println(profile.getAge());
		System.out.println(profile.getName());
		System.out.println(profile.isMarried());
	}
	public void setAge(byte age) {
		this.age=age;
	}
	public byte getAge() {
		return age;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setMarried(boolean isMarried) {
		this.isMarried=isMarried;
	}
	
	public boolean isMarried() {
		return isMarried;
	}
}
