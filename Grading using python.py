def grade(score):
    if 90 <= score <= 100:
        return "A"
    elif 87 <= score <= 89:
        return "A-"
    elif 84 <= score <= 86:
        return "B+"
    elif 80 <= score <= 83:
        return "B"
    elif 77 <= score <= 79:
        return "B-"
    elif 74 <= score <= 76:
        return "C+"
    elif 70 <= score <= 73:
        return "C"
    elif 67 <= score <= 69:
        return "C-"
    elif 64 <= score <= 66:
        return "D+"
    elif 62 <= score <= 63:
        return "D"
    elif 60 <= score <= 61:
        return "D-"
    else:
        return "F"

score = int(input("Enter your score: "))
print(f"Your grade is: {grade(score)}")
