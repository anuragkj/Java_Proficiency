def searchSuggestion(repository, customerQuery):
    searchstring = ""
    repository = [x.lower() for x in repository]
    repository.sort()
    for letter in customerQuery:
        searchstring += letter
        count = 0
        output_list = []
        if len(searchstring) > 1:
            for p in repository:
                if (len(p)>= len(searchstring)) and (searchstring.lower() == p[0:len(searchstring)]):
                    output_list.append(p)
                    count += 1
                    if (count == 3):
                        break
            print(output_list)
                    
                    
repository = ["mouse", "mobile", "moneypot", "monitor", "mousepad"]
customerQuery = "mouse"
searchSuggestion(repository, customerQuery)
