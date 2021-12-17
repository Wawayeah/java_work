package homework9;
import java.util.*;
public class MapBook {
	static class Book{
		private String index;
		private String name;
		private float price;
		private String publisher;
		public Book(String index,String name,float price,String publisher) {
			this.index = index;
			this.name = name;
			this.price = price;
			this.publisher = publisher;
		}
		//get��set
		public String getIndex() {
			return index;
		}
		public void setIndex(String index) {
			this.index = index;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public float getPrice() {
			return price;
		}
		public void setPrice(float price) {
			this.price = price;
		}
		public String getPublisher() {
			return publisher;
		}
		public void setPublisher(String publisher) {
			this.publisher = publisher;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        List<Book> books = new ArrayList<Book>();
        Map<String,Book> books1 = new HashMap<String,Book>();
        System.out.print("�������鱾������");
        int n = input.nextInt();
        for(int i = 0;i < n;++ i){
            String name,index,press,str;
            float price;
            index = input.next();//�鱾���
            name = input.next();//����
            price = input.nextInt();//����
            press = input.next();//������
            Book x = new Book(index,name,price,press);
            books.add(x);
            books1.put(index,x);
        }
        //���������鱾
        Iterator it = books.iterator();
        while(it.hasNext()){
            Book book = (Book) it.next();
            System.out.println(book.getName());
        }
        //�������б��ӳ�����
        Iterator it1 = books1.entrySet().iterator();
        while(it1.hasNext()){
            Map.Entry entry = (Map.Entry)it1.next();
            System.out.println("next :" + entry.getKey() + " " + ((Book)entry.getValue()).getName());
        }
	}

}
