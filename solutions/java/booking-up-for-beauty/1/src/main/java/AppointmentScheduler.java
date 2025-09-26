import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

class AppointmentScheduler {
    public LocalDateTime schedule(String appointmentDateDescription) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/d/yyyy H:mm:ss");
        return LocalDateTime.parse(appointmentDateDescription, formatter);
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
        LocalDateTime current = LocalDateTime.now();
        return current.isAfter(appointmentDate);
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        int h = appointmentDate.getHour();
        return h >= 12 && h < 18;
    }

    public String getDescription(LocalDateTime appointmentDate) {
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy");
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("h:mm a");
        return "You have an appointment on " + appointmentDate.format(format1) + ", at " + appointmentDate.format(format2) + ".";
    }

    public LocalDate getAnniversaryDate() {
        LocalDateTime current = LocalDateTime.now();
        int y = current.getYear();
        return LocalDate.of(y, 9, 15);
    }
}
