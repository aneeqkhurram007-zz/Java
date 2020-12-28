import java.util.Date;

public class Test {
    public static void main(String[] args) throws Exception {

        falvouredMilk fMilk = new falvouredMilk("Nespak", new Date(), "BlueBerry");
        fMilk.readyToSell(fMilk);
    }
}
