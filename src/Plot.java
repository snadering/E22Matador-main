public class Plot extends Property  {

    public Plot(int ID, String label, int cost, int income, int seriesID){
        super(ID, label,cost, income, seriesID);

    }

    public String onLand(Player p){
        String s = "";


        if(this.owner == p){
           /*TODO: følg aktivitetsdiagrammet Documentation/activity_OnLand_Plot_v1.1*/

           return s;
        }


        //Dette sker kun hvis feltet ikke ejes af spilleren
        return super.onLand(p);
    }


}
