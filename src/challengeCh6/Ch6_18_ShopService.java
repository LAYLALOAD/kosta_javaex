package challengeCh6;

public class Ch6_18_ShopService {
  private static Ch6_18_ShopService shopService = new Ch6_18_ShopService();
  private Ch6_18_ShopService() {}

  public static Ch6_18_ShopService getInstance() {
    return shopService;
  }
}
