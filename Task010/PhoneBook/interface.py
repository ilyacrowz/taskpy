def get_info ():
    info = []
    last_name = input('Enter Surname: ')
    info.append(last_name)
    first_name = input('Enter Name: ')
    info.append(first_name)
    phone_number = ''
    valid =False
    while not valid:
        try:
            phone_number = input('Enter Phone number: ')
            if len(phone_number) != 11:
                print('The number cannot be more than 11 digits')
            else:
                phone_number = int(phone_number)
                valid = True
        except:
            print('The number must contain only numbers')
    info.append(phone_number)
    description = input('Coment: ')
    info.append(description)
    return info