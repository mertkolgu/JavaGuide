package com.javase._16.coupling;

public class NotesForCoupling {
    //
}

// coupling -> bağlantı, bağlaşım gibi Türkçe karşılığı var.
// cohesion -> bağlılık, yapışıklık gibi anlamlara geliyor.

// iyi bir object oriented için istenen durum;
// loose coupling ve high cohesion

// bir projede N tane class olacaktır.
// classların birbirleriyle etkileşimleri olacaktır.
// coupling konusu : classların birbiriyle nasıl iletişim/etkileşim kurduğu ile ilgilidir.
// birbirini ne kadar bildiği ile igili kavramdır.
// classlar birbirinin değerlerine/instance değişkenlerin erişimi getter/setter ile yapmalıdır.
// encapsulation kuralına uyulduğunda loose couplinge katkı sağlanmış olur.

// loose coupling'e katkı sağlamak için encapsulation kuralına uy.
// (advance level -> dependency injection, code to interface prensibi vs...)