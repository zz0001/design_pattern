package 工厂模式;

public class PizzaStore {
	//加入对SimplePizzaFactory的引用
	SimplePizzaFactory factory;
	
	//构造方法需要一个工厂作为参数
	public PizzaStore(SimplePizzaFactory factory){
		this.factory = factory;
	}
	
	//orderPizza方法通过简单传入type来使用工厂创建实例
	public Pizza orderPizza(String type){
		Pizza pizza;
		//这里不再使用new操作
		pizza = factory.createPizza(type);
		pizza.prepare();
		pizza.bake();
	}
}
