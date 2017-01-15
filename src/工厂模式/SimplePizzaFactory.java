package 工厂模式;

/**
 * 工厂本身。
 * 定义一个类，为所有匹萨封装创建对象的代码
 * @author zz
 *
 */
public class SimplePizzaFactory {
	
	//所有客户用这个方法来实例化新对象
	public Pizza createPizza(String type){
		Pizza pizza = null;
		
		if(type.equals("cheese")){
			pizza = new CheesePizza();
		}else if(type.equals("pepperoni")){
			pizza = new PepperoniPizza();
		}
		return pizza;
	}
}
