# musicg
musicg is a lightweight audio analysis library, written in Java, with the
purpose of extracting both high level and low level audio features.

Original project on Google Code: https://code.google.com/archive/p/musicg/

This API allows developers to extract audio features and operate audio data
like reading, cutting and trimming easily from an inputstream. It also provides
tools for digital signal processing, renders the wavform or spectrogram for
research and development purpose.

Current features:

* Clap Api - Detect whether the input audio is a clap
* Whistle Api - Detect whether the input audio is a whistle
* Read PCM WAVE Headers
* Read audio data
* Trim the audio data
* Save the edited audio file
* Read amplitude-time domain data
* Read frequency-time domain data
* Render audio wave form image (Requires Java 2D & Java Image I/O, Android non-compatible)
* Render audio spectrogram image (Requires Java 2D & Java Image I/O, Android non-compatible)

Demo classes:

* `com.musicg.demo.FingerprintDemo`
* `com.musicg.demo.FingerprintRecognitionDemo`
* `com.musicg.demo.PitchDemo`
* `com.musicg.demo.RenderSpectrogramDemo`
* `com.musicg.demo.RenderWaveformDemo`
* `com.musicg.demo.WaveDemo`
* `com.musicg.demo.WhistleApiDemo`

NB: Some of the demo classes generate output, which gets stored in the `out` directory.