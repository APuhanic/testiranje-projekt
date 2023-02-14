# Metode i tehnike testiranja programske podrške

U ovom projektnom zadatku testira se vlastita web aplikacija.
https://github.com/APuhanic/flashcards. Prije testiranja potrebno je pomoću npm-a lokalno pokrenuti stranicu.

To je web aplikacija za kreiranje kartica za učenje, gdje se na svakoj kartici nalazi pitanje i odgovor, te se korisnik može se ocijeniti od 1 do 5 prilikom učenja.

**Zadatak ima 5 testnih slučajeva:**

• Prijavljivanje

• Registriranje

• Kreiranje špila za kartice
* Nakon što je korisnik prijavljen testira se radi li mogućnost kreiranja špilova\

• Kreiranje kartica
*  U kreirani špil testira dodavanje 3 novih kartica

• Pokretanje učenja
* Ovaj test samo prolazi kroz postojeće kartice i ako postoje stavlja ocjene\

**Korišteni alati:**

• Maven i TestNG
* UZ testng.xml pokreću se testovi kako su redom već nabrojani
* Prvo treba u terminalu pokrenuti *mvn test* zatim pokrenuti testove.

• IntelliJ IDEA Community Edition

• Selenium WebDriver\
• Katalon 
* Korištena je katalon ekstenzija za browser
s kojom su se dohvatili elementi uz xpath vrijednosti redom kako su se
elementi testirali

