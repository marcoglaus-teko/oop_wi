package ch.teko.oop.tag12.input.ue_oop12_02;

public class Main {
    public static void main(String[] args) {
        // neues SportTicket
        Ticket sportTicket = new SportTicket(new Ort("Luzern"), "Pokalfinale", 50, 5);
        System.out.printf("%s Ticketpreis: %f.-", sportTicket.getEventName(), sportTicket.berechneTicketPreis());
    }
}
