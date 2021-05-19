public class BonusMilesService {
    public int calculate(int cost) {

        int bonusInKopecs = 20_00; //в копейках
        int totalMills = cost / bonusInKopecs; 

        return totalMills;
    }


}
