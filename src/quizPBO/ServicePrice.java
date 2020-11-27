package quizPBO;

/**
 * @author NAMA     : Muhammad Anggawan Ridho Islami
 * KELAS    : IF 10K
 * NIM      : 10119909
 */

public class ServicePrice implements ServiceItem {
    private float priceService, discount;

    public float getPriceService() {
        return priceService;
    }

    public void setPriceService(float priceService) {
        this.priceService = priceService;
    }

    public void displayService(){}

    public float getPrice(int serviceItem){}

    @Override
    public boolean checkMemberStatus(String statusMember) {
        return false;
    }

    public float getSale(boolean isMember, float parServicePrice){}

    public float getTotalPay(float priceService, float discount){}

}
