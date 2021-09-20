package com.example.travelguideapp;

import java.util.ArrayList;

public class constants {
    ArrayList<Item> listItems = new ArrayList<>();
    Item item;

    public constants() {

    }

    public ArrayList<Item> populateData(String classname) {
        switch (classname) {
            case "Famous_Food":
                int[] image = {R.drawable.samosa, R.drawable.paani_puri, R.drawable.vada_pav, R.drawable.pav_bhaji};
                int[] desc = {R.string.samosa_text,R.string.paani_puri_text,R.string.vada_paav_text,R.string.paav_bhaji_text};
                int[] about = {R.string.samosa, R.string.paani_puri, R.string.vada_pav, R.string.pav_bhaji};
                listItems.clear();
                for (int i = 0; i < desc.length; i++) {
                    item = new Item();
                    item.setDescription(desc[i]);
                    item.setImage(image[i]);
                    item.setAbout(about[i]);
                    listItems.add(item);
                }
                return listItems;

            case "Famous_Shopping_Center":
                int[] image1 = {R.drawable.growels, R.drawable.inorbit, R.drawable.phoenix, R.drawable.oberoi};
                int[] desc1 = {R.string.growels_text,R.string.inorbit_text,R.string.phoneix_text,R.string.oberoi_text};
                int[] about1 = {R.string.growels, R.string.inorbit, R.string.phoneix, R.string.oberoi};
                listItems.clear();
                for (int i = 0; i < desc1.length; i++) {
                    item = new Item();
                    item.setDescription(desc1[i]);
                    item.setImage(image1[i]);
                    item.setAbout(about1[i]);
                    listItems.add(item);
                }
                return listItems;

            case "Tourist_Attraction":
                int[] image2 = {R.drawable.gateway, R.drawable.marinelines, R.drawable.national, R.drawable.cst};
                int[] desc2 = {R.string.gateway_text,R.string.marine_drive_text,R.string.natinal_park_text,R.string.CST_text};
                listItems.clear();
                int about2[] = {R.string.gateway_of_india, R.string.marine_drive, R.string.national_park, R.string.CST};
                for (int i = 0; i < desc2.length; i++) {
                    item = new Item();
                    item.setDescription(desc2[i]);
                    item.setImage(image2[i]);
                    item.setAbout(about2[i]);
                    listItems.add(item);
                }
                return listItems;

            case "Things_To_Buy":
                int[] image3 = {R.drawable.jeans, R.drawable.shirt, R.drawable.shoes, R.drawable.necklace};
                int[] desc3 = {R.string.jeans_text,R.string.shirt_text,R.string.shoes_text,R.string.necklace_text};
                listItems.clear();
                int about3[] = {R.string.jeans, R.string.shirt, R.string.shoes, R.string.necklace};
                for (int i = 0; i < desc3.length; i++) {
                    item = new Item();
                    item.setDescription(desc3[i]);
                    item.setImage(image3[i]);
                    item.setAbout(about3[i]);
                    listItems.add(item);
                }
                return listItems;

            default:
                return null;
        }
    }
}
