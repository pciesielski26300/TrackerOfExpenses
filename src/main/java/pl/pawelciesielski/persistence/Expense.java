package pl.pawelciesielski.persistence;

import lombok.*;
import org.springframework.security.core.userdetails.User;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "EXPENSES")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Expense {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EXPENSE_ID")
    private Long id;
    @Column(name = "CATEGORY")
    @Enumerated(EnumType.STRING)
    private Category categoryOfExpense;
    @Column(name = "VALUE")
    private double value;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "CREATION_DATE")
    private LocalDate localDate;
    //many to one, joincolumn na pewno
    private Account account;


}
