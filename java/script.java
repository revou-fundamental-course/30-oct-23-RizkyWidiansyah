function calculateBMI() {
    var weight = document.getElementById("weight").value;
    var height = document.getElementById("height").value;
    var age = document.getElementById("age").value;
    var gender = document.getElementById("gender").value;
    var bmi = (weight / ((height / 100) * (height / 100))).toFixed(2);
    var resultElement = document.getElementById("result");
    var interpretation = "";
    var advice = "";
    var impact = "";
    
    if (bmi < 18.5) {
        interpretation = "Underweight";
        advice = "Untuk meningkatkan berat badan, pastikan Anda mengonsumsi makanan yang kaya nutrisi dan kalori. Konsultasikan dengan dokter atau ahli gizi untuk rekomendasi yang tepat.";
        impact = "Dampak underweight dapat termasuk penurunan energi, penurunan fungsi sistem kekebalan tubuh, dan risiko tinggi terhadap masalah kesehatan tulang.";
    } else if (bmi >= 18.5 && bmi < 25) {
        interpretation = "Normal weight";
        advice = "Untuk menjaga berat badan, penting untuk selalu menjaga pola makan yang seimbang dan berolahraga secara teratur. Tetap konsisten dengan gaya hidup sehat Anda.";
        impact = "Dengan mempertahankan berat badan yang sehat, Anda dapat mengurangi risiko terhadap berbagai penyakit dan meningkatkan kesejahteraan secara keseluruhan.";
    } else if (bmi >= 25 && bmi < 30) {
        interpretation = "Overweight";
        advice = "Untuk menurunkan berat badan, penting untuk menjaga pola makan sehat dan rutin berolahraga. Konsultasikan dengan dokter atau ahli gizi untuk rencana penurunan berat badan yang aman dan efektif.";
        impact = "Dampak overweight dapat termasuk peningkatan risiko penyakit jantung, diabetes tipe 2, dan masalah kesehatan terkait.";
    } else {
        interpretation = "Obesity";
        advice = "Penting untuk segera mengadopsi pola makan sehat dan rutin berolahraga. Konsultasikan dengan dokter atau ahli gizi untuk rencana penurunan berat badan yang aman dan efektif.";
        impact = "Dampak obesitas dapat mencakup risiko tinggi terhadap berbagai penyakit serius, termasuk penyakit jantung, tekanan darah tinggi, diabetes, dan kondisi kesehatan lainnya.";
    }

    resultElement.innerHTML = `BMI Anda: ${bmi}. Anda termasuk kategori ${interpretation}. <br><br> Saran: ${advice} <br><br> Dampak: ${impact}`;
}

function resetForm() {
    document.getElementById("weight").value = "";
    document.getElementById("height").value = "";
    document.getElementById("age").value = "";
    document.getElementById("gender").value = "male";
    document.getElementById("result").innerHTML = "";
}