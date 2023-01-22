package com.example.davinciapp.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("La Gioconda o Mona Lisa es uno de los retratos más emblemáticos de la historia de la pintura. Fue pintado por Leonardo Da Vinci en el siglo XVI y posteriormente entró a las colecciones de la corte de Francia para finalmente formar parte de las obras de Arte exhibidas en el Museo del Louvre.  ");
    }

    public LiveData<String> getText() {
        return mText;
    }
}