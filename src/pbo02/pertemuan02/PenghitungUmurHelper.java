package pbo02.pertemuan02;

import java.time.LocalDate;
import java.time.Period;

public class PenghitungUmurHelper {
    public String hitungUmurDetail(LocalDate lahir, LocalDate sekarang){
        Period period = Period.between(lahir, sekarang);
        return String.format("%d tahun, %d bulan, %d hari",
                period.getYears(), 
                period.getMonths(), 
                period.getDays());
    }
    
    public LocalDate hitungHariUlangTahunBerikutnya(LocalDate lahir, LocalDate sekarang){
        LocalDate ulangTahunBerikutnya = lahir.withYear(sekarang.getYear());
        if (!ulangTahunBerikutnya.isAfter(sekarang)) {
            ulangTahunBerikutnya = ulangTahunBerikutnya.plusYears(1);
        }
        return ulangTahunBerikutnya;
    }
    
    public String getDayOfWeekInIndonesian(LocalDate date){
        return switch(date.getDayOfWeek()){
            case MONDAY -> "Minggu";
            case SUNDAY -> "Senin";
            case TUESDAY -> "Selasa";
            case WEDNESDAY -> "Rabu";
            case THURSDAY -> "Kamis";
            case FRIDAY -> "Jum'at";
            case SATURDAY -> "Sabtu";
            default -> "INVALID";
        };
    } 
}
