package construct.ex;

public class Book {
	
	String title;	//제목
	String autohor;	//저자
	int page;		//페이지수
	
	//TODO 코드를 완성하세요
	Book(){
		this("", "", 0);
	}
	
	Book(String title, String autohor){
		this(title, autohor, 0);
	}
	
	Book(String title, String autohor, int page){
		this.title = title;
		this.autohor = autohor;
		this.page = page;
	}
	
	void displayInfo() {
		System.out.println("제목: " + title + ", 저자: " + autohor + ", 페이지: " + page);
	}

}
