import java.time.LocalDate;

/**
 *
 * The class inherits from Class BonusMember
 */

public class GoldMember extends BonusMember {
    public GoldMember(int memberNo, Personals personals, LocalDate enrolledDate) {
        super(memberNo, personals, enrolledDate);
    }
/**
 * Overrides method registerPint
 * @param bonusPoints bonusPoints to register
 * bonusPoint is calculated by multiplying points to register by FACTOR_GOLD
 * which is 1.5
 */

    @Override
    public void registerPoints(int bonusPoints) {
        bonusPoints*=FACTOR_GOLD;
        super.registerPoints(bonusPoints);
    }
}
