package 工厂模式;

//NYPizzaStore拓展PizzaStore，所以拥有orderPizza方法
public class NYPizzaStore extends PizzaStore {

	public NYPizzaStore(SimplePizzaFactory factory) {
		super(factory);
		// TODO Auto-generated constructor stub
	}

	@Override
	//createPizza返回一个Pizza对象，由子类全权负责该实例化哪个
	Pizza createPizza(String type) {
		// 具体的业务逻辑
		if(type.equals("cheese")){
			return new NYStyleCheesePizza();
		}else if(type.equals("veggie")){
			return new NYStyleVeggiePizza();
		}else{
			return null;	
		}
	}
}
