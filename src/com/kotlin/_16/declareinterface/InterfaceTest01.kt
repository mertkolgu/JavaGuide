package com.kotlin._16.declareinterface

interface BuzUstundeKayabilme {
    fun buzUstendeKay()
}

interface BasketAtabilme {
    fun basketAt()
}

class Sportmenler : BuzUstundeKayabilme, BasketAtabilme {
    override fun buzUstendeKay() {
    }

    override fun basketAt() {
    }
}

// java ve kotlin çoklu kalıtım izin vermediği için bu sorunu
// interface yardımıyla çözüyoruz.