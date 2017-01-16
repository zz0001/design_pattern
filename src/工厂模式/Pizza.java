package 工厂模式;

import java.util.ArrayList;

/**
 * 抽象匹萨类，所有子类都必须派生自这个类
 * @author zz
 *
 */
public abstract class Pizza {

	String name;
	String dough;
	String sauce;
	ArrayList toppings = new ArrayList();
	void prepare() {
		// TODO Auto-generated method stub
		System.out.println("prepare "+ name);
		System.out.println("Tossing dough");
		System.out.println("adding sauce");
		System.out.println("adding toppings：");
		for(int i=0;i<toppings.size();i++){
			System.out.println("  "+ toppings.get(i));
		}
	}

	void bake() {
		// TODO Auto-generated method stub
		System.out.println("=====bake=====");
	}
	
	void cut(){
		System.out.println("=====cut=====");
	}
	
	void box(){
		System.out.println("=====box=====");
	}
	
	public String getName(){
		return name;
	}

}
