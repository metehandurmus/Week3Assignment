package dev.patika.business.concretes;

import dev.patika.business.abstracts.FlightService;
import dev.patika.core.utilities.helpers.FlightExpeditionHelper;
import dev.patika.dataAccess.concretes.FlightRepository;
import dev.patika.entities.abstracts.Chair;
import dev.patika.entities.concretes.FlightExpedition;

import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class FlightManager implements FlightService {
    @Override
    public void run() {
        FlightExpeditionHelper flightExpeditionHelper = new FlightExpeditionHelper();
        FlightRepository flightRepository = new FlightRepository(flightExpeditionHelper);

        this.printScreen(FlightRepository.flightExpeditionList);
        String[] choose = this.selectNumbers();

        FlightBusinessManager flightBusinessManager = new FlightBusinessManager(FlightRepository.flightExpeditionList.get(Integer.parseInt(choose[0]) - 1));
        start(flightBusinessManager, Integer.parseInt(choose[1]) - 1);
    }

    @Override
    public void printScreen(List<FlightExpedition> flightExpeditionList) {
        int i = 1;
        for (FlightExpedition flightExpedition : flightExpeditionList) {
            System.out.print(i+" -> ");
            System.out.println(flightExpedition);
            int j = 1;
            for(Chair chair : flightExpedition.getAirLine().getChairList()) {
                System.out.print(j+" -> ");
                System.out.println(chair);
                j += 1;
            }
            i += 1;
            System.out.println("-----------------------------------------------");
        }
    }

    @Override
    public String[] selectNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen uçuşunuzu ve koltuğunuzu seçin (1,3 vb.): ");
        String choose = scanner.nextLine();
        return choose.split(",");
    }

    public void start(FlightBusinessManager flightBusinessManager, int chairNum) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1 - Yemek Al");
            System.out.println("2 - Çık");
            String choose = scanner.nextLine();
            if (choose.equals("2")) {
                break;
            }
            else if (choose.equals("1")) {
                flightBusinessManager.YemekVer(chairNum);
            }
        }
    }
}
