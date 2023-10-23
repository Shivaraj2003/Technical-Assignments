import streamlit as st
from googletrans import Translator

# Create a Streamlit app title
st.title("Text Translator")

# Create a text input field for user input
user_input = st.text_input("Enter text to translate:")

# Create a dropdown for selecting the target language
target_language = st.selectbox("Select target language:", ["English", "Spanish", "French", "German", "Italian"])

# Initialize the Translator object
translator = Translator()

# Translate the user input to the selected target language
if st.button("Translate"):
    if user_input:
        try:
            translated_text = translator.translate(user_input, dest=target_language.lower())
            st.write(f"**Translated Text ({target_language}):** {translated_text.text}")
        except Exception as e:
            st.error(f"An error occurred: {str(e)}")
    else:
        st.warning("Please enter text to translate.")

# Add a footer
st.sidebar.markdown("---")
st.sidebar.text("Created with ❤️ by Your Name")

