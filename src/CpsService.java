public class CpsService {
    public int calculate(
            int sum,
            double percent,
            int time
    )
    {
        return (int) (sum*percent/12*Math.pow((1+percent/12), time)/(Math.pow((1+percent/12), time)-1));

    }
}
