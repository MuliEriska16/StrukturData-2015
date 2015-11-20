public class Gabung
{
   private double[] data ;
   private Kelompok[] kelompok = new Kelompok[5];
   
   int n;
 
      public Gabung (double [] data ){
       this.data=data;
       
          for (int i=0; i<5; i++){
           int awal = (data.length/5)*i;
           int akhir = awal+(data.length/5)-1;
           kelompok [i] = new Kelompok (awal,akhir,data);
        } 
        
       
       Thread t01 = new Thread (kelompok[0]);
       
       Thread t02 = new Thread (kelompok[1]);
       
       Thread t03 = new Thread (kelompok[2]);
       
       Thread t04 = new Thread (kelompok[3]);
       
       Thread t05 = new Thread (kelompok[4]);
       
       t01.start();
       t02.start();
       t03.start();
       t04.start();
       t05.start();
       
       }
    
        public double hasil(){
            try{
                Thread.sleep(1000);
            }
            catch (InterruptedException e){
         
            }
            double hasil = 0;
             for (int i=0; i<5; i++){
             hasil=hasil+kelompok[i].hasil();
            
        
        }
        return hasil;
   }
}
