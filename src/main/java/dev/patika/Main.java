package dev.patika;

/*
 *  Bir havayolu şirketi bilet alma sistemi tasarlamamız gerekiyor.
 *
 *  Case 1
 *  En az 2 farklı bilet hesaplama yöntemi olan bir uçuş sistemi olmalı.
 *  Örneğin: THY ve Pegasus gibi olabilir.
 *
 *  Case2
 *  Yolcu bilet almaya geldiğinde ona boş olan koltuklar gösterilmeli.
 *  Bunun için koltuk numaralandırılması önceden yapılabilir.
 *  A1, A2, A3, B1, B2, B3 gibi koltuklar doldurulabilir.
 *
 *  Case 3
 *  Her uçuş şirketinin yurtiçi ve yurtdışına özel davranışları olabilir.
 *  Örnek: Pegasus sadece yurtdışı uçuşlarında yemek veriyordur.
 *  Ama THY hem yurtiçi hem yurtdışı uçuşlarda bu hizmeti sağlıyordur gibi.
 *
 *  Case4
 *  Uçaklarda ekonomi ve business koltuğu olan uçaklar varsa hesaplama ona göre yapılmalı.
 */

import dev.patika.business.abstracts.FlightService;
import dev.patika.business.concretes.FlightManager;

public class Main {
    public static void main(String[] args) {
        FlightService flightManager = new FlightManager();
        flightManager.run();
    }
}