package com.example.davinciapp.ui.slideshow;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SlideshowViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public SlideshowViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Además de su obra pictórica, Leonardo da Vinci, el gran artista del Renacimiento, modelo del uomo universale, fue también un genio científico.Se dedicó a la observación rigurosa, el experimento y la formulación exacta de principios generales a partir de la experiencia empírica. En los miles de páginas de sus cuadernos de notas, que sólo han empezado a ser estudiados a fondo en las últimas décadas, encontramos anticipaciones de muchos desarrollos posteriores de la ciencia moderna. Sus contemporáneos sabían que Leonardo dedicaba buena parte de su tiempo al estudio de la filosofía natural, que es como se llamaba a la ciencia entonces (el término inglés scientist no apareció hasta 1840) y asimismo tenemos constancia de que Leonardo planeaba publicar numerosos tratados científicos con los materiales recogidos en sus cuadernos. Pero pese a su enorme dedicación, nunca consiguió llevar a buen término su propósito.");
    }

    public LiveData<String> getText() {
        return mText;
    }
}