package co.edu.uniquindio.parcial_2.dto;

public record PrestamoDto(int numeroReferencia,
                          double valorInteres,
                          int plazoEnMes,
                          double saldoDisponible,
                          double valorPrestamo) {
}
