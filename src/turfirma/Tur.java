package turfirma;
public class Tur {
    public static void main(String[] args) {
        String[][] db = { // страна, стоимость, сколько добираться, звезд, на чем
                {"Турция", "50000", "3", "4 звезды", "самолет"},
                {"Турция", "80000", "4", "5 звезд", "самолет"},
                {"Египет", "70000", "6", "3 звезды", "самолет"},
                {"ОАЭ", "120000", "5", "4 звезды", "самолет"},
                {"Кипр", "100000", "4", "4 звезды", "самолет"},
                {"Сочи", "50000", "12", "2 звезды", "автобусе"},
                {"Байкал", "100000", "24", "4 звезды", "поезде"},
                {"германия", "60000", "15", "5 звезд", "поезде"}
        };
        SelectTur.select(db, '4', "самолет");  // Поиск тура 4 звезды и самолет
    }
}