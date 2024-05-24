# University Management System

## Περιγραφή

Αυτό το σύστημα διαχείρισης πανεπιστημίου επιτρέπει τη διαχείριση φοιτητών, καθηγητών και μαθημάτων μέσω ενός REST API, αναπτύχθηκε με Java και Spring Boot.

## Τεχνολογίες

- Java 11
- Spring Boot
- Spring Data JPA
- Hibernate
- H2 Database
- Maven

## Οντότητες

### Student
- `id`
- `name`
- `email`
- `courses`

### Professor
- `id`
- `name`
- `email`
- `role`

### Course
- `id`
- `name`

## Υπηρεσίες (Services)

- `StudentService`
  - Προσθήκη, ενημέρωση, διαγραφή και αναζήτηση φοιτητών
  - Αναζήτηση φοιτητών βάσει μαθήματος

- `ProfessorService`
  - Προσθήκη, ενημέρωση, διαγραφή και αναζήτηση καθηγητών
  - Αναζήτηση καθηγητών βάσει ρόλου

## Ελεγκτές (Controllers)

- `StudentController`
  - Διαχείριση φοιτητών
  - Αναζήτηση φοιτητών βάσει μαθήματος

- `ProfessorController`
  - Διαχείριση καθηγητών
  - Αναζήτηση καθηγητών βάσει ρόλου

## Οδηγίες Εγκατάστασης

1. Κλωνοποίηση αποθετηρίου:
   ```sh
   git clone https://github.com/your-username/university-management-system.git
   cd university-management-system

Μελλοντικές Προεκτάσεις
-Ανάπτυξη frontend με React ή Angular
-Προσθήκη αυθεντικοποίησης και εξουσιοδότησης με Spring Security
-Δημιουργία αναφορών και στατιστικών

Συνεισφορά
Οι συνεισφορές είναι ευπρόσδεκτες! Ανοίξτε ένα θέμα ή ένα pull request για να συμβάλετε.
