package java_threadlocal;

import static java.lang.Thread.sleep;

public class FieldService {
    private String nameStore;

    public String logic(String name) throws InterruptedException {
        System.out.println("์ ์ฅ = " + name);
        System.out.println("nameStore = " + nameStore);
        nameStore = name;
        sleep(1000);
        System.out.println("์กฐํ = " + nameStore);
        return nameStore;
    }
}
