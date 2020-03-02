package com.android.dicoding.oenophilia;

import java.util.ArrayList;

public class WineData {
    public static String[][] data = new String[][]{
            {"Domaine de la Romanée-Conti Romanée-Conti Grand Cru","Average Price: $19,702","https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/3819-0-ori-1547091143.jpeg?crop=0.3xw:1xh;center,top&resize=480:*","The Burgundy producer Domaine Romanée-Conti, known as \"DRC\" to collectors, consistently commands the highest prices in the world of wine. Its top vineyard, Romanée-Conti, encompasses just 4.5 acres."},
            {"Domaine Leroy Musigny Grand Cru","Average Price: $19,702","https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/163666-1547091358.jpg?crop=0.3xw:1xh;center,top&resize=480:*","Another Burgundy offering, Domaine Leroy practices biodynamic farming."},
            {"Egon Muller Scharzhofberger Riesling Trockenbeerenauslese","Average Price: $13,220","https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/m2266-1-1547091648.jpg?crop=0.25xw:1xh;center,top&resize=980:*","The most expensive white wine is this riesling from the Mosel region of Germany. The Müller family has been producing wines in the steep, slate vineyards there since 1797."},
            {"Domaine Georges & Christophe Roumier Musigny Grand Cru","Average Price: $12,882","https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/002564baec4813766e1a0f-1547091859.jpg?crop=0.539xw:0.904xh;0.235xw,0.0692xh&resize=980:*","Georges Roumier established his domaine in 1924, and his son and grandson, Jean-Marie and Christophe Roumier, took over the winemaking after his death in 1965. Today it is made up of about 28.5 acres in the Chambolle-Musigny, Morey-Saint-Denis, and Corton-Charlemagne regions of Burgundy."},
            {"Domaine Leflaive Montrachet Grand Cru","Average Price: $10,030","https://hips.hearstapps.com/vader-prod.s3.amazonaws.com/1547095994-domaine-leflaive-montrachet-grand-cru-cote-de-beaune-france-10580582-1547091999.jpg?crop=0.39xw:1xh;center,top&resize=768:*","Domaine Leflaive bottles can be found for less than $75, but wines from the 12 acres of grand cru vineyards go for much more."},
            {"J.S. Terrantez Madeira","Average Price: $8,285","https://hips.hearstapps.com/vader-prod.s3.amazonaws.com/1547092212-screen-shot-2019-01-09-at-10-49-42-pm-1547092191.png?crop=1.00xw:0.936xh;0,0.0337xh&resize=768:*","This fortified wine from Portugal was produced the same year Thomas Jefferson was sworn in for his second presidential term. Try finding anything else this old that's still drinkable — it'll be tough."},
            {"Domaine de la Romanée-Conti Montrachet Grand Cru","Average Price: $7,924","https://hips.hearstapps.com/vader-prod.s3.amazonaws.com/1547096586-image-916125-full-768x1024-1547092356.jpg?crop=0.4xw:1xh;center,top&resize=768:*","DRC is also known for this white wine, as few as 250 cases of which are released each year."},
            {"Domaine Leroy Chambertin Grand Cru","Average Price: $7,480","https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/domaine-leroy-chambertin-grand-cru-cote-de-nuits-france-10151720-1547092438.jpg?crop=0.940xw:0.978xh;0.0221xw,0.00298xh&resize=980:*","Lalou Bize-Leroy founded Domaine Leroy in 1988. Chambertin is the second of her grands crus to make this list."},
            {"Domaine Leroy Richebourg Grand Cru","Average Price: $6,015","https://hips.hearstapps.com/vader-prod.s3.amazonaws.com/1547092836-16434-big-1547092820.jpg?crop=0.5xw:1xh;center,top&resize=768:*","A vintage with a post-world-war appeal that is known for its full-bodied taste profile. Only 700 bottles are made a year."},
            {"Screaming Eagle Sauvignon Blanc","Average Price: $5,983","https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/1000x-1-1547093032.jpg?crop=0.2xw:1xh;center,top&resize=980:*","Screaming Eagle is primarily known for its cult cabernet sauvignon, but its sauvignon blanc production is even more limited."},
    };

    public static ArrayList<Wine> getListData(){
        ArrayList<Wine> list = new ArrayList<>();
        for (String[] aData : data){
            Wine wine = new Wine();
            wine.setName(aData[0]);
            wine.setAvgprice(aData[1]);
            wine.setPhoto(aData[2]);
            wine.setDescription(aData[3]);

            list.add(wine);
        }
        return list;
    }
}
