# Evicencija Plata #

Evidencija plata je Java web aplikacija koja je namenjena za za evidenciju sektora kompanije, zaposlenih po sektorima, menadzera, titula  i plata.

Za razvoj aplikacije korišćeni su:

-  NetBeans razvojno okruzenje sa integrisanom Apache Derby bazom.
-  Glassfish aplikacioni server.
- Za razvoj frontend-a i backend-a korišćen je frejmork  Bootsfaces (Jsf + Bootstrap) uz kombinaciju sa Primefaces-om.
- Za dependency management je korišćen maven.
- Za perzistenciju(objektno relaciono mapiranje) je korišćena implementacija JPA-EclipseLink.

U toku razvoja aplikacije naišlo se na problem mapiranja xhtml stranica koje su povezane sa template-om. Stranice su podeljenje u foldere koji imaju nazive po tabeli(klasi) sa kojom su povezani. Zbog toga je i nastao problem prilikom mapiranja zbog potrebe izlaska iz lokacije i ulaska u drugi folder koji može da dovede do izlaska iz konteksta aplikacije. Problem je rešen koršćenjem atributa outcome  koji omogućava direktno mappiranje xhtml fajla preko view-a.

Tokom razvoja aplikacije korišćen je Primefaces  zbog panel komponente sidebar(podržan od verzije primefaces 6.2) koji još uvek nije podržan u Bootsfaces. Takođe su korišćene i sledeće komponente primefacesa <p:selectOneMenu>, <p:growl> i <p:messages> koji ne funkcionišu dobro u okviru bootsfaces tehnologije.

Za kreiranje izveštaja plata korišćena je  Bootsfaces komponenta <b:dataTable>: atribut pdf je setovan na true što omogućava ekstraktovanje trenutnog prikaza tabele u pdf fajl,  atribut multi-column-search je setovan na true što omogućava pretrage po svakoj koloni tabele i na taj način omogućava   kreiranje izvestaja o platama za nekog zaposlenog za zadati period (od - do) ili sumarnog izvestaj o platama za celu firmi za zadati period.




## License

Copyright © 2018 FIXME


