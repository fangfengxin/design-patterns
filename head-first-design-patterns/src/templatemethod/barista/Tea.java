package templatemethod.barista;

/**
 * @Author hustffx
 * @Date 2020/5/6 13:38
 */
public class Tea extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Lemon");
    }
}
