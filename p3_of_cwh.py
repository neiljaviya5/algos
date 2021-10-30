# spam comments

text = input("Enter Your Comment !\n")

if("subscribe this" in text):
    spam= True
elif("buy now" in text):
    spam= True
elif("make money" in text):
    spam= True
elif("click this" in text):
    spam= True
else:
    spam= False

if(spam):
    print("This is a spam, sorry")
else:
    print("Thank you, for your response")