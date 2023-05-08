package constructor;

public class a1 {

	 String name;
	 int marks;
	 a1(String name,int marks){
		 this.name=name;
		 this.marks=marks;
		 System.out.println(this.name+" "+marks);
	 }
	
	
	
	public static void main(String[] args) {
		a1 a=new a1("a",50);
		a1 a1=new a1("b",60);
		a1 a2=new a1("c",70);
		a1 a3=new a1("d",80);
		a1 a4=new a1("e",95);
		a1 a5=new a1("f",30);
		a1 a6=new a1("g",75);
		a1 a7=new a1("h",87);
		a1 a8=new a1("i",81);
		a1 a9=new a1("j",92);
		a1 a10=new a1("k",15);
		a1 a11=new a1("l",67);
		a1 a12=new a1("m",49);
	}

}
