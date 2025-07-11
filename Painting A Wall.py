def calculate_wall_area(width, height):
    return width * height

def calculate_paint_cost(area, cost_per_sqft):
    return area * cost_per_sqft

def calculate_sales_tax(cost, tax_rate):
    return cost * tax_rate / 100

def calculate_gallons_of_paint(area, coverage_per_gallon):
    return area / coverage_per_gallon

def main():
    try:
        # Read input from the user
        width = float(input("Enter the width of the wall (in feet): "))
        height = float(input("Enter the height of the wall (in feet): "))
        cost_per_sqft = float(input("Enter the cost of paint per square foot: $"))
        coverage_per_gallon = float(input("Enter the coverage of paint per gallon (in square feet): "))

        # Calculate the area of the wall
        wall_area = calculate_wall_area(width, height)

        # Calculate the gallons of paint needed
        gallons_of_paint_needed = calculate_gallons_of_paint(wall_area, coverage_per_gallon)

        # Calculate the cost of paint
        paint_cost = calculate_paint_cost(wall_area, cost_per_sqft)

        # Assuming a constant sales tax rate of 7.5%
        sales_tax_rate = 7.5
        sales_tax = calculate_sales_tax(paint_cost, sales_tax_rate)

        # Calculate the total cost (including sales tax)
        total_cost = paint_cost + sales_tax

        # Print the result with two decimal places
        print(f"Wall Area: {wall_area} square feet")
        print(f"Gallons of Paint Needed: {gallons_of_paint_needed:.2f} gallons")
        print(f"Cost of Paint: ${paint_cost:.2f}")
        print(f"Sales Tax ({sales_tax_rate}%): ${sales_tax:.2f}")
        print(f"Total Cost: ${total_cost:.2f}")

    except ValueError:
        print("Invalid input. Please enter valid numbers.")

if __name__ == "__main__":
    main()
