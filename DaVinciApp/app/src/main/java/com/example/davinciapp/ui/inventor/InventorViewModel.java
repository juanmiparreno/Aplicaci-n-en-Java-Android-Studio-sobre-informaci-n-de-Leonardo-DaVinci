package com.example.davinciapp.ui.inventor;


import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class InventorViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public InventorViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("De entre todos los ingenios de guerra que Leonardo inventó para el duque Ludovico de Milán, esta ballesta gigante es una de las más detalladas en sus más mínimos engranajes. Tal vez quiera decir que se trataba de un verdadero diseño para ser llevado a la práctica, puesto que realmente pocos de los dibujos de Leonardo tuvieron una traducción física.");
    }

    public LiveData<String> getText() {
        return mText;
    }
}