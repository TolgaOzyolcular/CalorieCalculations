function getCalories() {

    let weight = document.getElementById("weight").value;
    let height = document.getElementById("height").value;
    let age = document.getElementById("age").value;
    let sex = document.getElementById("sex").value;
    let activityLevel = document.getElementById("activityLevel").value;

    if(isNaN(weight) || weight < 50){
        alert("The weight must be at least 50lbs");
        return;
    }

    if(isNaN(height) || height < 100 || height > 400){
        alert("The height must be at least 100cm");
        return;
    }

    if(isNaN(age) || age < 10 || age > 150){
        alert("The age much be between 10 & 150");
        return;
    }

    if(sex != "male" && sex != "female"){
        alert("The sex must be male or female");
        return;
    }

    let BMR = 0;
    let activityFactor = 0;

    switch(sex){
        case "male": BMR = (10.0*weight) + (6.25*height) - (5.0*age) + 5;
        break;
        case "female": BMR = (10.0*weight) + (6.25*height) - (5.0*age) - 161;
        break;
    }

    switch(activityLevel){
        case "0": activityFactor = 1; //sleep
        break;
        case "1": activityFactor = 1.31; //sedentary
        break;
        case "2": activityFactor = 1.55; //lightly
        break;
        case "3": activityFactor = 1.73; //moderate
        break;
        case "4": activityFactor = 2.2; //vigorous
        break;
        case "5": activityFactor = 2.5; //competitive
        break;
    }

    BMR = BMR * activityFactor;

    document.getElementById("maintenance").innerHTML = Math.floor(BMR);
    document.getElementById("comfortable").innerHTML = Math.floor(BMR) - 327;
    document.getElementById("fast").innerHTML = Math.floor(BMR) - 638;
    document.getElementById("extreme").innerHTML = Math.floor(BMR) - 992;

}
