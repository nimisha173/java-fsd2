package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class productprice {

	public static void main(String[] args) {
	List<Product> productlist=new ArrayList<Product>();
	//adding product
	productlist.add(new Product("soap",1,5000));
	productlist.add(new Product("pen",2,23442));
	productlist.add(new Product("paper",3,12000));
	List<Float>productprice=productlist.stream().filter(p->p.price >10000).map(p->p.price).collect(Collectors.toList());
	
	System.out.println(productprice);

	}

}
