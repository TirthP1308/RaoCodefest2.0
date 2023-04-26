import java.util.*;
public class europianTownship{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();
        while(T>0){
            int N;
            double totalhours=0,accentqty=0,regularqty=0;
            N = sc.nextInt();
            while(N>0){
                int TotalBedrooms,R,S,H;
                TotalBedrooms = sc.nextInt();
                R = sc.nextInt();
                S = sc.nextInt();
                H = sc.nextInt();

                double hours = calculateHours(TotalBedrooms,R,S,H);
                double accent = calculateAccent(TotalBedrooms,R,S,H);
                double regular = calculateRegular(TotalBedrooms,R,S,H);

                totalhours += hours;
                accentqty += accent;
                regularqty += regular;

                N--;
            }
            System.out.println("totalhours:"+ totalhours);
            System.out.println("accentqty:"+ accentqty);
            System.out.println("regularqty:"+ regularqty);
            T--;
        }
    }
    public static double calculateHours(int TotalBedrooms,int R,int S,int H){
        int Bedrooms = TotalBedrooms-R;
        int BedroomsWalls = Bedrooms*4;
        int RWalls = R*3;
        int SWalls = (S-Bedrooms)*4;
        int HWalls = H*6;
        int TotalWalls = BedroomsWalls+RWalls+SWalls+HWalls;
        double accentcolor = TotalWalls/3.0;
        double regularcolor = 2*TotalWalls/3.0;

        return (accentcolor*2.5)+(regularcolor*3.25);
    }
    public static double calculateAccent(int TotalBedrooms,int R,int S,int H){
        int Bedrooms = TotalBedrooms-R;
        int BedroomsWalls = Bedrooms*4;
        int RWalls = R*3;
        int SWalls = (S-Bedrooms)*4;
        int HWalls = H*6;
        int TotalWalls = BedroomsWalls+RWalls+SWalls+HWalls;
        double accentcolor = TotalWalls/3.0;
        
        return accentcolor*1.5;
    }
    public static double calculateRegular(int TotalBedrooms,int R,int S,int H){
        int Bedrooms = TotalBedrooms-R;
        int BedroomsWalls = Bedrooms*4;
        int RWalls = R*3;
        int SWalls = (S-Bedrooms)*4;
        int HWalls = H*6;
        int TotalWalls = BedroomsWalls+RWalls+SWalls+HWalls;
        double regularcolor = 2*TotalWalls/3.0;

        return regularcolor*2.25;
    }
    
}