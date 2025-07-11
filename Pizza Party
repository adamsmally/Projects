def calculate_cost(people_attending, slices_per_person, cost_per_pizza):
    total_slices = people_attending * slices_per_person
    pizzas_needed = (total_slices + 7) // 8  # Round up to the nearest integer number of pizzas

    total_cost = pizzas_needed * cost_per_pizza
    return total_cost

def calculate_sales_tax(cost, tax_rate):
    return cost * tax_rate / 100

def main():
    try:
        # Read input from the user
        people_friday = int(input("Number of people attending on Friday: "))
        slices_per_person_friday = float(input("Average number of slices per person on Friday: "))
        cost_per_pizza_friday = float(input("Cost of one pizza on Friday: $"))

        people_saturday = int(input("Number of people attending on Saturday: "))
        slices_per_person_saturday = float(input("Average number of slices per person on Saturday: "))
        cost_per_pizza_saturday = float(input("Cost of one pizza on Saturday: $"))

        people_sunday = int(input("Number of people attending on Sunday: "))
        slices_per_person_sunday = float(input("Average number of slices per person on Sunday: "))
        cost_per_pizza_sunday = float(input("Cost of one pizza on Sunday: $"))

        # Calculate the cost for each day
        cost_friday = calculate_cost(people_friday, slices_per_person_friday, cost_per_pizza_friday)
        cost_saturday = calculate_cost(people_saturday, slices_per_person_saturday, cost_per_pizza_saturday)
        cost_sunday = calculate_cost(people_sunday, slices_per_person_sunday, cost_per_pizza_sunday)

        # Calculate the total cost for all three days
        total_cost = cost_friday + cost_saturday + cost_sunday

        # Assuming a constant sales tax rate of 7.5%
        sales_tax_rate = 7.5
        sales_tax = calculate_sales_tax(total_cost, sales_tax_rate)
        total_cost_with_tax = total_cost + sales_tax

        # Read the delivery charge from the user
        delivery_charge = float(input("Enter delivery charge: $"))

        # Calculate the total cost for the entire weekend (including delivery charge)
        total_cost_weekend = total_cost_with_tax + delivery_charge

        # Print the result with two decimal places
        print(f"Cost on Friday: ${cost_friday:.2f}")
        print(f"Cost on Saturday: ${cost_saturday:.2f}")
        print(f"Cost on Sunday: ${cost_sunday:.2f}")
        print(f"Total cost for all three days: ${total_cost:.2f}")
        print(f"Sales tax ({sales_tax_rate}%): ${sales_tax:.2f}")
        print(f"Total cost with tax: ${total_cost_with_tax:.2f}")
        print(f"Delivery charge: ${delivery_charge:.2f}")
        print(f"Total cost for the entire weekend: ${total_cost_weekend:.2f}")

    except ValueError:
        print("Invalid input. Please enter valid numbers.")

if __name__ == "__main__":
    main()
